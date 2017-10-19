package seedu.address.model.WebLink;

import static java.util.Objects.requireNonNull;
import seedu.address.commons.exceptions.IllegalValueException;

public class WebLink {
    public static final String MESSAGE_WEB_LINK_CONSTRAINTS = "it should be a web link you want to stalk.";
    public static final String WEB_LINK_VALIDATION_REGEX = "^\\S+";

    public final String webLinkInput;

    /**
     * Validates given web link.
     *
     * @throws IllegalValueException if the given tag name string is invalid.
     */
    public WebLink(String name) throws IllegalValueException {
        requireNonNull(name);
        String trimmedWebLink = name.trim();
        if (!isValidWebLink(trimmedWebLink)) {
            throw new IllegalValueException(MESSAGE_WEB_LINK_CONSTRAINTS);
        }
        this.webLinkInput = trimmedWebLink;
    }

    /**
     * Returns true if a given string is a valid tag name.
     */
    public static boolean isValidWebLink(String test) {
        return test.matches(WEB_LINK_VALIDATION_REGEX);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof WebLink // instanceof handles nulls
                && this.webLinkInput.equals(((WebLink) other).webLinkInput)); // state check
    }

    @Override
    public int hashCode() {
        return webLinkInput.hashCode();
    }

    /**
     * Format state as text for viewing.
     */
    public String toString() {
        return '[' + webLinkInput + ']';
    }

    /**
     * Format state as text for viewing.
     */
    public String toStringFilter() {
        return webLinkInput;
    }

}
