package com.cyberbyte.photogallery.usecase

import com.cyberbyte.photogallery.data.PhotoEntity
import com.cyberbyte.photogallery.service.PhotoGalleryDataService

class RemoveFavoritePhotoUseCase(
    private val photoGalleryDataService: PhotoGalleryDataService
) {
    suspend fun invoke(photos: List<PhotoEntity>){
        photoGalleryDataService.removeFavoritePhotos(photos)
    }
}