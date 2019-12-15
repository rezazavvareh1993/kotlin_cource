package ir.calendar.kotlincource.kotlincodes.recyclerview


//@Component(module = [RecyclerComponent::class])
interface RecyclerComponent {

    fun getAdapter() : KotlinRecyclerViewAdapter

//    fun getActivity(kotlinRecyclerViewActivity: KotlinRecyclerViewActivity)
}