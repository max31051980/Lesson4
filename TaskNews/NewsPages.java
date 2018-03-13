package TaskNews;

import java.util.Scanner;

public class NewsPages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input quantity of News: ");
        int news = scan.nextInt();
        int amountOfPages = pages(news);
        System.out.println("Amount of Pages: " + amountOfPages);
    }

    public static int pages(int news) {
        if (news % 10 == 0) {
            return (news / 10);
        } else
            return (news / 10 + 1);
    }
}