package seedu.address.commons.util;

//@@author AngularJiaSheng

import java.util.HashMap;
import java.util.Iterator;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 * Hashmap implementation
 */
public class WebLinkUtil {

    public HashMap<String, String> matchingWebsites = new HashMap<>();

    /*Keywords that can be used to match website to certain categories. */
    private static final String FACEBOOK_MATCH_REGEX = "(?i)^^.*(facebook.com|fb.com/|facebook).*$";
    private static final String TWITTER_MATCH_REGEX = "(?i)^^.*(twitter.com|t.co|twitter).*$";
    private static final String INSTAGRAM_MATCH_REGEX = "(?i)^^.*(instagram.com|instagram|insta).*$";

    /*tag names for the categorized web links*/
    public static final String FACEBOOK_TAG = "facebook";
    public static final String TWITTER_TAG = "twitter";
    public static final String INSTAGRAM_TAG = "instagram";

    public WebLinkUtil(){
        matchingWebsites.put(FACEBOOK_MATCH_REGEX, FACEBOOK_TAG);
        matchingWebsites.put(INSTAGRAM_MATCH_REGEX, INSTAGRAM_TAG);
        matchingWebsites.put(TWITTER_MATCH_REGEX, TWITTER_TAG);
    }

}