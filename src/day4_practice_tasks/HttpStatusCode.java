package day4_practice_tasks;

public class HttpStatusCode {
    public static void main(String[] args) {

        int IfStatusCode = 200;

        switch (IfStatusCode) {

            case 200:
                System.out.println("OK"); break;
            case 201:
                System.out.println("Created"); break;
            case 202:
                System.out.println("Accepted"); break;
            case 301:
                System.out.println("Moved Permanently");
            case 302:
                System.out.println("See Other"); break;
            case 304:
                System.out.println("Not Modified"); break;
            case 400:
                System.out.println("Bad request"); break;
            case 401:
                System.out.println("Unauthorized"); break;
            case 403:
                System.out.println("Forbidden"); break;
            case 404:
                System.out.println("Not Found"); break;
            case 410:
                System.out.println("Gone"); break;
            case 500:
                System.out.println("Internal Server Error"); break;
            case 503:
                System.out.println("Service Unavailable"); break;
            default:
                System.out.println("invalid");

        }



    }
}
