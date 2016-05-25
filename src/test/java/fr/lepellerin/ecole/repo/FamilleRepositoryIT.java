package fr.lepellerin.ecole.repo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import fr.lepellerin.ecole.config.GestEcoleTestPersistenceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

/**
 * IT for Famille repository.
 *
 * @author Landocore
 *
 */
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
    DirtiesContextTestExecutionListener.class, TransactionalTestExecutionListener.class,
    DbUnitTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { GestEcoleTestPersistenceConfig.class })
@DatabaseSetup(FamilleRepositoryIT.DATASET)
@DatabaseTearDown(type = DatabaseOperation.DELETE_ALL, value = { FamilleRepositoryIT.DATASET })
@DirtiesContext
public class FamilleRepositoryIT {

  protected static final String DATASET = "classpath:datasets/it-famille.xml";

  @Autowired
  private FamilleRepository repository;

  @Test
  public void findWithoutUserAccountShouldReturnOneItem() {
    assertThat(repository.findWithoutUserAccount(), hasSize(1));
  }

}
