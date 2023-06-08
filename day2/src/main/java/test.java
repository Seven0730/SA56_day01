public class test {
    public static void main(String[] args) {

        makenoise(new Ani(),2);
    }
    public static <T extends Ani> void makenoise(T myAni, int N){


        myAni.makeSound();
    }
}
