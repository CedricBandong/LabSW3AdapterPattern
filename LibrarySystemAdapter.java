public class LibrarySystemAdapter {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    public void integrateSystem() {
        librarySystem.manageBooks();
    }
}