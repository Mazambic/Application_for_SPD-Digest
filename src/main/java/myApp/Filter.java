package myApp;

public class Filter {

    public String charFilter(String in) {
        StringBuilder stringBuilder = new StringBuilder();
        in.toUpperCase()
                .chars()
                .distinct()
                .forEach(s -> stringBuilder.append((char) s));
        return stringBuilder.toString();
    }

    public String[] groupMaker(String in) {
        String[] temp = {"", ""};
        for (char c : in.toCharArray()) {
            if ((byte) c % 2 == 0) {
                temp[0] += c;
            } else
                temp[1] += c;
        }
        return temp;
    }

    public int differenceBetweenSumsOfValue(String firstGroup, String secondGroup) {
        return Math.abs(firstGroup.chars().sum() - secondGroup.chars().sum());
    }


}
