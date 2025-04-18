package seedu.address.ui;

/**
 * Contains display preferences for the user interface. This will be configured using list command.
 */
public class DisplayPreferences {

    // Default display preferences
    private static boolean showName = true;
    private static boolean showPhone = true;
    private static boolean showEmail = true;
    private static boolean showAddress = true;
    private static boolean showStudentId = true;
    private static boolean showTelegram = true;
    private static boolean showTags = true;
    private static boolean showTutorials = true;

    // Getters and setters
    public static boolean isShowName() {
        return showName;
    }

    public static void setShowName(boolean showName) {
        DisplayPreferences.showName = showName;
    }

    public static boolean isShowPhone() {
        return showPhone;
    }

    public static void setShowPhone(boolean showPhone) {
        DisplayPreferences.showPhone = showPhone;
    }

    public static boolean isShowEmail() {
        return showEmail;
    }

    public static void setShowEmail(boolean showEmail) {
        DisplayPreferences.showEmail = showEmail;
    }

    public static boolean isShowAddress() {
        return showAddress;
    }

    public static void setShowAddress(boolean showAddress) {
        DisplayPreferences.showAddress = showAddress;
    }

    public static boolean isShowStudentId() {
        return showStudentId;
    }

    public static void setShowStudentId(boolean showStudentId) {
        DisplayPreferences.showStudentId = showStudentId;
    }

    public static boolean isShowTelegram() {
        return showTelegram;
    }

    public static void setShowTelegram(boolean showTelegram) {
        DisplayPreferences.showTelegram = showTelegram;
    }

    public static boolean isShowTags() {
        return showTags;
    }

    public static void setShowTags(boolean showTags) {
        DisplayPreferences.showTags = showTags;
    }

    public static boolean isShowTutorials() {
        return showTutorials;
    }

    public static void setShowTutorials(boolean showTutorials) {
        DisplayPreferences.showTutorials = showTutorials;
    }
    /**
     * Resets the display preferences to their default state (show all fields).
     */
    public static void resetToDefault() {
        showName = true;
        showPhone = true;
        showEmail = true;
        showAddress = true;
        showStudentId = true;
        showTelegram = true;
        showTags = true;
        showTutorials = true;
    }
}
