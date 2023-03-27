import java.util.Scanner;

public class mainMobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String typingN,typingI;
        Mobile Nokia = new Mobile();
        Mobile Iphone = new Mobile();

        int i;
        while (Nokia.isOn && Iphone.isOn) {
            System.out.println("1.Nokia");
            System.out.println("2.Iphone");
            System.out.print("choose: ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    i = -1;
                    do {
                        System.out.println("===Nokia===");
                        System.out.println("1.Show info phone");
                        System.out.println("2.Inbox to Iphone");
                        System.out.println("3.Sent mess Iphone");
                        System.out.println("4.Change phone");
                        int chosse = sc.nextInt();
                        switch (chosse) {
                            case 1:
                                Nokia.displayInfo();
                                break;
                            case 2:
                                System.out.print("Typing: ");
                                sc.nextLine();
                                typingN = sc.nextLine();
                                Nokia.ComposeMsg(typingN);
                                Nokia.recevie(typingN);
                                Nokia.displayBox();
                                break;
                            case 3:
                                Nokia.ComposeMsg(Iphone.composeMsg);
                                Nokia.recevie(Iphone.composeMsg);
                                Nokia.sent(Iphone);
                                Nokia.displaySent();
                                break;
                            case 4:
                                i += 3;
                                break;
                        }
                    } while (i < 0);
                    break;
                case 2:
                    i = -1;
                    do {

                        System.out.println("===Iphone===");
                        System.out.println("1.Show info phone");
                        System.out.println("2.Inbox to Iphone");
                        System.out.println("3.Sent mess Iphone");
                        System.out.println("4.Change phone");
                        int chosseI = sc.nextInt();
                        switch (chosseI) {
                            case 1:
                                Iphone.displayInfo();
                                break;
                            case 2:
                                System.out.print("Typing: ");
                                sc.nextLine();
                                typingI = sc.nextLine();
                                Iphone.ComposeMsg(typingI);
                                Iphone.recevie(typingI);
                                Iphone.displayBox();
                                break;
                            case 3:
                                Iphone.ComposeMsg(Nokia.composeMsg);
                                Iphone.recevie(Nokia.composeMsg);
                                Iphone.sent(Iphone);
                                Iphone.displaySent();
                                break;
                            case 4:
                                i+=3;
                                break;
                        }
                    } while (i < 0);
                    break;
            }
        }
    }
}

