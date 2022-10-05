public class regex_test {
    public static void main(String[] args) {
        System.out.println("a".matches("[abc]"));
        String regex = "1[3-9]\\d{9}";
        String regex1 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("13220537977".matches(regex1));
        System.out.println("13220537977".matches(regex));
        //邮箱
        String regex2 = "\\w+@[\\w&&[^_]]{2,6}\\.([a-zA-Z]{2,3}){1,2}";
        System.out.println("474944802@qq.com".matches(regex2));
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        String regex5 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:33:33".matches(regex5));
        String regex6 = "\\w{4,16}";
        System.out.println("clampooo".matches(regex6));
        //(0-9)|x|X或者[0-9xX]方括号里面不用写直线
        String regex7 = "[1-9][0-9]{16}(0-9|x|X)";
        String regex11 = "[1-9][0-9]{16}(0-9|(?i)x)";

        System.out.println("23038119980205501x".matches(regex7));
        System.out.println("23038119980205501x".matches(regex11));
        String regex8="(?i)abc";//忽略abc大小写
        String regex9="a(?i)bc";//忽略bc大小写
        String regex10="a((?i)b)c";//忽略b大小写
        System.out.println("-----------------------------------");
        String regex12 = "[1-9]\\d{5}((1[8-9])|20)\\d{2}(0[1-9]|1[0-2])(0\\d|[12]\\d|3[01])\\d{3}[\\dXx]";
        String regexcai = "[1-9]\\d{5}[(1[8-9])(20)][0-9]{2}[0\\d[1[0-2]]][([0-2]\\d)(30)(31)]";
        System.out.println("23038119980205".matches(regex12));
        String regex13 = "[(1[8-9])(20)]";
        String regex14 = "[^(1|2|3)]";
        System.out.println("4".matches(regex14));

    }
}
