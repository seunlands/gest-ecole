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
			alert('OK');
		}
	});
}