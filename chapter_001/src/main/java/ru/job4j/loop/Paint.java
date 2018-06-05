package ru.job4j.loop;

public class Paint {

//  public String Pyramide(int height){
//
//        for(){
//            for(){
//                if(){
//
//                }
//            }
//        }
//
//
//    }

    public String rightTriangle(int height) {
        int width = height;
        StringBuilder screen = new StringBuilder();
        String sep = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i >= j) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(sep);
        }
        return screen.toString();
    }
    public String leftTriangle(int height){
        int width = height;
        StringBuilder screen = new StringBuilder();
        String sep = System.lineSeparator();
        for(int i = 0;i<height;i++){
            for(int j=0;j<width;j++){

            }
        }



    }
}
