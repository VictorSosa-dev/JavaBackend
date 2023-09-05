package e3;

public class TextEditor {

    private Command saveCommand;

    public TextEditor(Command saveCommand) {
        this.saveCommand = saveCommand;
    }

    public void onPressSaveButton(){
        System.out.println("[Saved button]");
        saveCommand.execute();
    }

    public void onPressSaveOption(){
        System.out.println("[Manu]");
        saveCommand.execute();
    }

    public void onShortcut(){
        System.out.println("[Shortcut]");
        saveCommand.execute();
    }

}
