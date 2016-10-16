GestEcole = {};
GestEcole.app = {};

function fnInitDetaillerRepas(contextPath) {
	GestEcole.app.contextPath = contextPath;
	$('.reserve').click(fnSelectTd);
	$('.libre').click(fnSelectTd);
}

function fnSelectTd() {
	var caseId = $(this).prop('id').split('_');
	$.ajax({
		url : GestEcole.app.contextPath + '/cantine/details/reserver',
		method : 'POST',
		data : {
			date : caseId[0],
			individuId : caseId[1],
			_csrf : $("input[name='_csrf']").val()
		},
		success: function(data) {
			if (data === 'reserve') {
				$('#' + caseId[0] + '_' + caseId[1]).removeClass('libre');
				$('#' + caseId[0] + '_' + caseId[1]).addClass('reserve');
			} else if (data === 'libre') {
				$('#' + caseId[0] + '_' + caseId[1]).addClass('libre');
				$('#' + caseId[0] + '_' + caseId[1]).removeClass('reserve');				
			}
		},
		error: function() {
			if (!alert('Erreur lors de la sauvegarde !')) {
				window.location.reload();
			}
		}
	});
}

function fnSelectMois() {
	$('#repasForm').submit();
}

