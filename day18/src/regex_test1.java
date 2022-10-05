import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_test1 {
    public static void main(String[] args) {
        String str = "java自从95年问世以来,经历了很多版本,abbbbbbbbbbbbbbbbbbbbbbbbbb" +
                "目前企业中用的最高的是Java8和Java11,因为这两个是产期支持版本," +
                "下一个长期支持版本是java17,相信在未来不久java17也会逐渐登上历史的舞台";
        String regex1="((?i)Java)(?=8|11|17)";
        String regex2="((?i)Java)(8|11|17)";
        String regex3="((?i)Java)(?:8|11|17)";
        String regex4="((?i)Java)(?!8|11|17)";

        //默认贪婪爬取,加上问号就是非贪婪爬取
        String regex5 = "ab+?";

        Pattern p = Pattern.compile(regex5);
        Matcher m = p.matcher(str);
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }

    }

}

