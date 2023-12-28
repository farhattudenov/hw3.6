// YourAdapter.kt
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.hw36.YourItemModel

private val ItemLayoutBinding.textViewName: Any
    get() {
        TODO("Not yet implemented")
    }
private var Any.text: String
    get() {
        TODO("Not yet implemented")
    }
    set(c) = Unit

class YourAdapter(private val items: List<YourItemModel>) :
    RecyclerView.Adapter<YourAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: YourItemModel) {
            binding.textViewName.text = item.name
        }
    }
}
