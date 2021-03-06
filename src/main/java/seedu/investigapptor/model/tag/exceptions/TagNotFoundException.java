package seedu.investigapptor.model.tag.exceptions;

import seedu.investigapptor.commons.exceptions.DuplicateDataException;

/**
 * Signals that the operation will result in duplicate Person objects.
 */
public class TagNotFoundException extends DuplicateDataException {
    public TagNotFoundException() {
        super("Tag does not exist");
    }
}
