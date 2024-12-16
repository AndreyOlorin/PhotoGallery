package com.cyberbyte.photogallery.usecase

import com.cyberbyte.photogallery.data.PhotoEntity
import com.cyberbyte.photogallery.model.Src
import com.cyberbyte.photogallery.service.PhotoGalleryDataService

class GetFavoritePhotoUseCase(
    // Provide data managing for app
    private val photoGalleryDataService: PhotoGalleryDataService
) {
    // Processing data from remote REST-API
    suspend fun invoke(): List<PhotoEntity>{
        return photoGalleryDataService.getFavoritePhoto()
    }
}