package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String USER_NAME_INPUT_GUIDE_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String ITEM_INPUT_GUIDE_MESSAGE = "\n실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String LADDERS_HEIGHT_INPUT_GUIDE_MESSAGE = "\n최대 사다리 높이는 몇 개인가요?";
    private static final String RESULT_INPUT_GUIDE_MESSAGE = "\n결과를 보고 싶은 사람은?";
    private static final String INVALID_HEIGHT_FORMAT_MESSAGE = "사다리 높이는 정수만 입력가능합니다.";
    private static final String USER_NAME_SPLIT_CHARACTER = ",";
    private static final int USER_NAME_SPLIT_LIMIT = -1;
    private final Scanner sc = new Scanner(System.in);

    public List<String> inputUserName() {
        System.out.println(USER_NAME_INPUT_GUIDE_MESSAGE);
        return Arrays.asList(sc.nextLine()
                .split(USER_NAME_SPLIT_CHARACTER, USER_NAME_SPLIT_LIMIT));
    }

    public int inputLadderHeight() {
        try {
            System.out.println(LADDERS_HEIGHT_INPUT_GUIDE_MESSAGE);
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(INVALID_HEIGHT_FORMAT_MESSAGE);
        }
    }

    public List<String> inputItem() {
        System.out.println(ITEM_INPUT_GUIDE_MESSAGE);
        return Arrays.asList(sc.nextLine()
                .split(USER_NAME_SPLIT_CHARACTER, USER_NAME_SPLIT_LIMIT));
    }

    public String inputWinner() {
        System.out.println(RESULT_INPUT_GUIDE_MESSAGE);
        return sc.nextLine();
    }
}