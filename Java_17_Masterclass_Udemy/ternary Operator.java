public class ternary Operator {

    public static void main(String[] args) {
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        // ternaty(제4) 연산자는 변수에 두 개 값 중 하나를 할당하는 숏컷이다
        // if than else 문의 단축
        // 1 opperand(항) = 테스트할 조건/표현
        // 2 opperand(항) = (조건이 true)할당되는 값. boolean에서 true라면 false 도출
        // 3 opperand(항) = (조건이 false)할당되는 값. boolean에서 false라면 true 도출
        if (isDomestic) {
            System.out.println("This car is domestic to our country")}
        } // = boolean isDomestic = (makeOfCar != "Volkswagen");
        // 실행 밴드의 유형은 동일한 자료형이나 호환가능한 유형
        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
        System.out.println("Our Client is " + ageText);
    }
}