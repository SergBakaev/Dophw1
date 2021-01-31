public class Main {
    public static void main(String[] args) {
        int num = getWorkingHours(DayOfWeek.Monday);

        switch (num){
            case 6 :
                System.out.println("Сегодня выходной");
            case 7 :
                System.out.println("Сегодня выходной");
            default:
                System.out.println(String.format("До конца рабочей недели осталось %d часов", num));
        }
    }

    public static int getWorkingHours(DayOfWeek dayOfWeek) {

        int sum = 0;
        for(int i = dayOfWeek.ordinal(); i < dayOfWeek.values().length; i++){
            sum += dayOfWeek.values()[i].getWorkingHours();

        }
        return sum;
    }
}
