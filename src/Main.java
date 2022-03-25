public class Main {
    public static void main(String[] args) {
        System.out.println("Family_member");
        Family_member me=new Family_member();
        me.setName("MANH NGUYEN");
        me.setId(1);
        me.setAge(19);
        me.setPhone_number("0393796115");
        System.out.println(me);
        Family_member myBrother=new Family_member();
        myBrother.setName("MANH NGUYEN");
        myBrother.setId(2);
        myBrother.setAge(23);
        myBrother.setPhone_number("0383796116");
        System.out.println(myBrother);
    }
}
