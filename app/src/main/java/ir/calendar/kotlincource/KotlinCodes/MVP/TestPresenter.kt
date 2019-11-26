package ir.calendar.kotlincource.KotlinCodes.MVP

class TestPresenter(private val view : TestMVPActivity) : TestMVPContract.Presenter {

    val model = TestModel(this)

     override fun getAllName(){
        model.fetchAllName()
    }

    override fun onNameReceived(namesList : List<String>){
        view.onNameReceived(namesList)
    }
}