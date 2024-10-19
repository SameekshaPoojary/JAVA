class StudentN {

    public void displayMessage() {
        System.out.println("this is a method without a parameter.");
    }

    public void displayMessageWithName(String name) {
        System.out.println("Hello" + name + ", this is a method with a parameter.");
    }

    public static void main(String[] args) {
        StudentN obj = new StudentN();
        obj.displayMessage();
        obj.displayMessageWithName("Sameeksha");
    }

}
