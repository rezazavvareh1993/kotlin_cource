package ir.calendar.kotlincource.kotlincodes.mvp

interface TestMVPContract {

    interface Presenter{
        fun getAllName()
        fun onNameReceived(namesList : List<String>)
    }

    interface View{
        fun onNameReceived(namesList : List<String>)
        fun setUpRecyclerView(names : List<String>)
        fun showToast(it: String)

    }
}