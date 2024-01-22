package playWithJavaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class VendingMachine extends Thread{
    Scanner sc = new Scanner(System.in);
    int balance = 0;

    public void startMachine() {
        System.out.println("안녕하세요. 음료 자판기 입니다.\n" +
                "[메뉴] \n" +
                "커피 : 200원 \t 유자차 : 300원 \t 율무차 : 400원 \t 코코아 : 250원\n" +
                "주문하시겠습니까? (Y / N)");
        String orderAnswer = sc.next();
        orderStart(orderAnswer);
    }

    private void orderStart(String orderAnswer) {

        if (orderAnswer.equals("Y") || orderAnswer.equals("y")) {
            insertCoin();
        } else if (orderAnswer.equals("N") || orderAnswer.equals("n")) {
            System.out.println("사용해 주셔서 감사합니다. 안녕히 가세요.");
        } else {
            System.out.println("Y(y) 또는 N(n)으로 입력해주세요\n");
            startMachine();
        }
    }

    private void insertCoin() {
        String coinChoice = "0";
        while (!Pattern.matches("[4,5]",coinChoice)) {
            System.out.println("동전을 넣어주세요\n"
                    + "현재 잔액 : " + balance + "\n"
                    + "1 : 50원 \t 2: 100원 \t 3: 500원 \t 4 : 주문하기 \t 5: 동전 반환하기");
            coinChoice = sc.next();
            if (Pattern.matches("[1-5]", coinChoice)) {
                switch (coinChoice) {
                    case "1":
                        balance += 50;
                        break;
                    case "2":
                        balance += 100;
                        break;
                    case "3":
                        balance += 500;
                        break;
                    case "4":
                        order();
                        break;
                    case "5":
                        System.out.println(balance + "원을 반환해드리겠습니다.");
                        end();
                        break;
                }
            } else {
                System.out.println("잘못 입력하셨습니다. 1에서 5 사이의 숫자만 입력해주세요.\n");
                coinChoice = sc.next();
            }
        }
    }

    private void end() {
        System.out.println("사용해 주셔서 감사합니다. 안녕히 가세요.");
    }

    private void order() {
        String drinkChoice = "0";
        System.out.println("주문하실 음료를 선택해주세요.\n" +
                "1. 커피 : 200원 \t 2. 유자차 : 300원 \t 3. 율무차 : 400원 \t 4. 코코아 : 250원\t 5. 동전 반환하기 \n");
        drinkChoice = sc.next();
        if (Pattern.matches("[1-5]", drinkChoice)) {
            makeDrinkChoice(drinkChoice);
        } else {
            System.out.println("잘못 입력하셨습니다. 1에서 5 사이의 숫자만 입력해주세요.\n");
            drinkChoice = sc.next();
        }

    }

    private void makeDrinkChoice(String drinkChoice) {
        String addOrder = "";
        String addCoin="";
        switch (drinkChoice) {
            case "1":
                if (balance >= 200) {
                    makeDrink();
                    balance -= 200;
                    System.out.println("음료가 완성되었습니다. 추가로 주문하실건가요? (Y / N)\n" +
                            "현재 잔액 : " + balance + "원\n");
                    addOrder = sc.next();
                    checkAddOrder(addOrder);
                } else {
                    System.out.println("잔액이 부족합니다. 동전을 넣으시겠습니까? (Y / N)");
                    addCoin = sc.next();
                    checkAddCoin(addCoin);
                }
                break;
            case "2":
                if (balance >= 300) {
                    makeDrink();
                    balance -= 300;
                    System.out.println("음료가 완성되었습니다. 추가로 주문하실건가요? (Y / N)\n" +
                            "현재 잔액 : " + balance + "원\n");
                    addOrder = sc.next();
                    checkAddOrder(addOrder);
                } else {
                    System.out.println("잔액이 부족합니다. 동전을 넣으시겠습니까? (Y / N)");
                    addCoin = sc.next();
                    checkAddCoin(addCoin);
                }
                break;
            case "3":
                if (balance >= 400) {
                    makeDrink();
                    balance -= 400;
                    System.out.println("음료가 완성되었습니다. 추가로 주문하실건가요? (Y / N)\n" +
                            "현재 잔액 : " + balance + "원\n");
                    addOrder = sc.next();
                    checkAddOrder(addOrder);
                } else {
                    System.out.println("잔액이 부족합니다. 동전을 넣으시겠습니까? (Y / N)");
                    addCoin = sc.next();
                    checkAddCoin(addCoin);
                }
                break;
            case "4":
                if (balance >= 250) {
                    makeDrink();
                    balance -= 250;
                    System.out.println("음료가 완성되었습니다. 추가로 주문하실건가요? (Y / N)\n" +
                            "현재 잔액 : " + balance + "원\n");
                    addOrder = sc.next();
                    checkAddOrder(addOrder);
                } else {
                    System.out.println("잔액이 부족합니다. 동전을 넣으시겠습니까? (Y / N)");
                    addCoin = sc.next();
                    checkAddCoin(addCoin);
                }
                break;
            case "5":
                System.out.println("잔액은 "+balance+"입니다.\n");
                end();
                break;
        }

    }

    private void makeDrink() {
        System.out.println("음료를 만드는 중입니다.");
        run();
    }

    private void checkAddCoin(String addCoin) {
        if(addCoin.equals("Y")||addCoin.equals("y")){
            insertCoin();
        }else if(addCoin.equals("N")||addCoin.equals("n")){
            System.out.println("잔액은 "+balance+"입니다.\n");
            end();
        }else{
            System.out.println("Y(y) 또는 N(n)으로 입력해주세요\n 주문 페이지로 돌아갑니다.");
        }
    }

    private void checkAddOrder(String addOrder) {
        if(addOrder.equals("Y")||addOrder.equals("y")){
            order();
        }else if(addOrder.equals("N")||addOrder.equals("n")){
            System.out.println("잔액 "+balance+"입니다.\n");
            end();
        }else{
            System.out.println("Y(y) 또는 N(n)으로 입력해주세요\n 주문 페이지로 돌아갑니다.");
        }
    }

    public void run(){
        ArrayList<String> makeDrinkImg = new ArrayList<>(List.of("               \n"+"━┐          ┌━\n"+" │          │ \n"
                +" │          │ \n"+" │          │ \n"+" │          │ \n"+" └──────────┘ \n"
                +"              \n","               \n"+"━┐          ┌━\n"+" │          │ \n"
                +" │          │ \n"+" │          │ \n"+" │──────────│ \n"+" └──────────┘ \n"
                +"              \n","               \n"+"━┐          ┌━\n"+" │          │ \n"
                +" │          │ \n"+" │──────────│ \n"+" │          │ \n"+" └──────────┘ \n"
                +"              \n","               \n"+"━┐          ┌━\n"+" │          │ \n"
                +" │──────────│ \n"+" │          │ \n"+" │          │ \n"+" └──────────┘ \n"
                +"              \n"));


        try{
            for (int i = 0; i < makeDrinkImg.size(); i++) {
                System.out.println(makeDrinkImg.get(i));
                Thread.sleep(1000);
            }
        }catch (Exception e){

        }

    }


    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.startMachine();
    }

}
