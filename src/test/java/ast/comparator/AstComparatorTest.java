package ast.comparator;

import java.io.File;

import org.junit.Test;


public class AstComparatorTest {
    @Test
    public void should_analysis_java_class() throws Exception {
        // given
        // when
        AstComparator astComparator = new AstComparator();

        astComparator.compare(new File("src/test/java/ast/comparator/AstClass.java"), new File("src/test/java/ast/comparator/AstClass.java"));

        // then
    }
}
