package ch14_abstraction.Interface;

public class ACController {
    private TempDownButton tempDownButton;
    private TempUpButton tempUpButton;

    public ACController(TempDownButton tempDownButton, TempUpButton tempUpButton) {
        this.tempDownButton = tempDownButton;
        this.tempUpButton = tempUpButton;
    }

    public void onDownTempDownButton(){
        tempDownButton.onDown();
    }

    public void onPressTempDownButton(){
        tempDownButton.onPressed();
    }

    public void onUpTempUpButton(){
        System.out.println(tempUpButton.onUp());
    }

    public void onPressTempUpButton(){

        tempUpButton.onPressed();
    }


}
