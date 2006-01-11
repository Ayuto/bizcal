package bizcal.common;

import java.util.*;

/**
 * @author Fredrik Bertilsson
 */
public class Bundle_sv
        extends ListResourceBundle
{
    private Object[][] _contents =
    {
        { "View", "Visa" },
        { "Day", "Dag" },
        { "Work week", "Arbetsvecka" },
        { "Week", "Vecka" },
        { "Two weeks", "Tv� veckor" },
        { "Month", "M�nad" },
        { "Group", "Grupp" },		
        { "Technical error", "Tekniskt fel" },

    };


    public Object[][] getContents()
    {
        return _contents;
    }

}
