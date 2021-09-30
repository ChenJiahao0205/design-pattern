package pers.chenjiahao.command;

public class Main {
    public static void main(String[] args) {
        Content c = new Content();

        Command insertCommend = new InsertCommand(c);
        insertCommend.doit();
        insertCommend.undo();

        Command copyCommand = new CopyCommand(c);
        copyCommand.doit();
        copyCommand.undo();

        Command deleteCommand = new DeleteCommand(c);
        deleteCommand.doit();
        deleteCommand.undo();

        System.out.println(c.msg);
    }
}
