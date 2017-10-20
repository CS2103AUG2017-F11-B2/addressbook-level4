package seedu.address.model.person;

import static org.junit.Assert.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WEB_LINK_DEFAULT;
import static seedu.address.model.person.weblink.WebLinkUtil.FACEBOOK_TAG;
import static seedu.address.testutil.TypicalPersons.AMY;

import java.util.ArrayList;

import org.junit.Test;

public class ListOfWebLinkByCategoryTest {

    @Test
    public void isValidOutputOfWebLinks() {
        ReadOnlyPerson toAdd = AMY;
        ArrayList<String> ExpectedOutput= new ArrayList<String>();
        ExpectedOutput.add(VALID_WEB_LINK_DEFAULT);
        assertTrue(isTwoArrayListsWithSameValues(ExpectedOutput, AMY.listOfWebLinkByCategory(FACEBOOK_TAG)));
    }

    public boolean isTwoArrayListsWithSameValues(ArrayList<String> list1, ArrayList<String> list2) {
        //null checking
        if (list1 == null && list2 == null) {
            return true;
        }
        if ((list1 == null && list2 != null) || (list1 != null && list2 == null)) {
            return false;
        }
        if (list1.size() != list2.size()) {
            return false;
        }
        for (Object itemList1: list1) {
            if (!list2.contains(itemList1)) {
                return false;
            }
        }
        return true;
    }
}
