class Hello {

    private String say;
    private String age;

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



    public static void main(String[] args){
        Hello hello = new Hello();

        hello.setSay("leedongwooklee");

        System.out.println(hello.say);
    }
}