package laura.teste.suite;

import jdk.jfr.Category;
import laura.teste.categorii.CategorieBoundery;
import laura.teste.categorii.CategorieUtilizareFake;
import laura.teste.test.TestAgentieCuDubluri;
import laura.teste.test.TestPachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestPachetTuristic.class, TestAgentieCuDubluri.class})
@Categories.IncludeCategory(CategorieUtilizareFake.class)
@Categories.ExcludeCategory(CategorieBoundery.class)

public class SuiteTesteCuFakeuri {

}
