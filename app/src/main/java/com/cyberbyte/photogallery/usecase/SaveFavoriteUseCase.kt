package com.cyberbyte.photogallery.usecase

import com.cyberbyte.photogallery.data.PhotoEntity
import com.cyberbyte.photogallery.service.PhotoGalleryDataService

class SaveFavoriteUseCase(
    // Provide data managing for app
    private val photoGalleryDataService: PhotoGalleryDataService
) {
    // Processing data from remote REST-API
    suspend fun invoke(photos: List<PhotoEntity>){
        return photoGalleryDataService.saveFavoritePhotos(photos)
    }
}