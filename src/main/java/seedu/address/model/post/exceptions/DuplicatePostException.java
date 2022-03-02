package seedu.address.model.post.exceptions;

import seedu.address.model.person.exceptions.DuplicatePersonException;

/**
 * Signals that the operation will result in duplicate Posts (Posts are considered duplicates if they have the same
 * identity).
 */
public class DuplicatePostException extends RuntimeException {
    public DuplicatePostException() {
        super("Operation would result in duplicate posts");
    }
}