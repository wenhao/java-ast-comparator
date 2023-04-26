package ast.comparator;

import java.io.File;
import java.nio.charset.StandardCharsets;

import com.puppycrawl.tools.checkstyle.AstTreeStringPrinter;
import com.puppycrawl.tools.checkstyle.JavaParser;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FileText;
import static com.puppycrawl.tools.checkstyle.JavaParser.Options.WITH_COMMENTS;

public class AstComparator {

    private static final String CHARSET_NAME = System.getProperty("file.encoding", StandardCharsets.UTF_8.name());

    /**
     * git diff --summary --ignore-space-at-eol --ignore-space-change --ignore-all-space <commit-id1> <commit-id2>
     */
    public void compare(final File originalFile, final File newFile) throws Exception {
        DetailAST originalDetailAST = JavaParser.parseFileText(new FileText(originalFile, CHARSET_NAME), WITH_COMMENTS);
        DetailAST newDetailAST = JavaParser.parseFileText(new FileText(newFile, CHARSET_NAME), WITH_COMMENTS);

        String printAst = AstTreeStringPrinter.printAst(new FileText(originalFile, CHARSET_NAME), WITH_COMMENTS);
        System.out.println(printAst);
    }
}
