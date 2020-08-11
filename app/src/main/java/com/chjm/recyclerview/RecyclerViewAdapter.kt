package com.chjm.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    private val itemTitles = arrayOf("landscape1", "landscape2", "landscape3", "landscape4", " landscape5", " landscape6")
    private val itemDetails = arrayOf("2015", "2016", "2018", "2020", "2014", "2017")

    private val itemImages = intArrayOf(
        R.drawable.ic_landscape1,
        R.drawable.ic_landscape2,
        R.drawable.ic_landscape3,
        R.drawable.ic_landscape4,
        R.drawable.ic_landscape5,
        R.drawable.ic_landscape6

    )

    private val itemText = arrayOf(

        "Your photo description may be vivid and well written, but it won’t serve the client if it dates the copy. Stick with timeless details that will always be relevant. This not only improves the value of the products you may selling, but it makes an article a perfect read no matter what season or year it is.\n" +
                "\n" +
                "Along with adding rich, relevant descriptions, keep in mind what the audience is looking for. Readers generally what to know the who, what, why, when, where and how of pictures. Be specific and professional, so that viewers have a better understanding of what they are looking at.",
        "If necessary, speculate about what’s happening in the picture to give it context and make it pertain to your products/services (or your clients’ products and services). This is a no-no in photo journalism, but it’s perfectly fine to use a little imagination when writing photo descriptions for content marketing purposes. This can help drive home a point and add context and narrative to a blog.\n",
        "It doesn’t matter if you are writing 40 words or 400 words, always spell check the document and proofread your writing. That being said, when photo descriptions ARE your business, then having the content checked for spelling and grammar becomes even that much more important. Always have a second set of eyes looking over the content to make sure it stays sharp and makes sense.\n",
        "This social media platform is already picture-based, so the little content you include counts. Instagram users scroll through their feeds quickly, so consider included smaller, catchier captions. Keep in mind that captions are cut after a few lines and require readers to click a button to read the whole thing, so keep the most important information at the top.\n",
        "If you want to create photo descriptions for the accessibility of the blind and low vision community, you will have to do it manually. Once enabled, you can add a description for a photo by tapping the “add a description” button at the bottom of the image. Users who require this will hear the text through screen reader technology.\n",
        "Outside of the company types listed above, pictures and their descriptions can also be a great help to standard content marketing campaigns.  Finding any excuse to add some relevant content into your blogs and web pages is what you must do to create an advantage over your competitors. Adding image text can help your readers and optimize your blog posts.\n"
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var textTitle: TextView
        var textDes: TextView
        var text2: TextView

        init {

            image = itemView.findViewById(R.id.item_image)
            textTitle = itemView.findViewById(R.id.item_title)
            textDes = itemView.findViewById(R.id.item_details)
            text2 = itemView.findViewById(R.id.item_text)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_model, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return itemTitles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.textTitle.text = itemTitles[position]
        holder.textDes.text = itemDetails[position]

        holder.image.setImageResource(itemImages[position])
        holder.text2.text = itemText[position]

        holder.itemView.setOnClickListener { view: View ->
            Toast.makeText(view.context, "Clicked on the item", Toast.LENGTH_SHORT).show()
        }
    }
}

