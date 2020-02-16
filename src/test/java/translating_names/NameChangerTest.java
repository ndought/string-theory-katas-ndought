package translating_names;

import org.assertj.core.api.AbstractStringAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameChangerTest {
  public NameChanger underTest;

  @BeforeEach
  protected void setUnderTest() {
    underTest = new NameChanger();

  }
  @Test
  public void appReturnsLowerCase() {
    underTest.setInput("Hello");
    String result = underTest.translateToSnakeCase();
    final AbstractStringAssert<?> hello = assertThat(result).isEqualTo("hello");
  }









  //  @Test
//  public void translateToSnakeCase_GivenHelloWorld_Returns_hello_world() {
//    NameChanger underTest = new NameChanger();
//    String result = underTest.translateToSnakeCase("HelloWorld");
//    assertThat(result).isEqualTo("hello_world");
//  }


}
