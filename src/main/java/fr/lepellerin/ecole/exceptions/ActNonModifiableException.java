package fr.lepellerin.ecole.exceptions;

public class ActNonModifiableException extends FunctionalException {

  /**
   * serial UID.
   */
  private static final long serialVersionUID = 1L;

  public ActNonModifiableException(final String message) {
    super(message);
  }

}
