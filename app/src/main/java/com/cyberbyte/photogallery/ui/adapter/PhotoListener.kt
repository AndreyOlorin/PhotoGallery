package com.cyberbyte.photogallery.ui.adapter

import com.cyberbyte.photogallery.model.Photo

// Provide handle events of photo items
interface PhotoListener {
    
    // Handle on photo click event
    fun onPhotoClicked(photo: Photo)
}
