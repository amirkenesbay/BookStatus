public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover availableStatusMover = new FromAvailableStatusMover();
        availableStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getStatus());

        BookMover archivedStatusMover = new FromArchivedStatusMover();
        archivedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());

        availableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());

        BookMover borrowedStatusMover = new FromBorrowedStatusMover();
        borrowedStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());

        BookMover overduedStatusMover = new FromOverduedStatusMover();
        overduedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());
    }
}
