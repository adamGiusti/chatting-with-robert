public class Main {
    public static void main(String[] args) {
        chatWithRobert();
    }

    static void chatWithRobert() {
        Robert robert = new Robert();

        robert.introduce();
        robert.askUserName();
        robert.askUserBirthYear();
        robert.playQuiz();
        robert.finishConversation();
    }
}
