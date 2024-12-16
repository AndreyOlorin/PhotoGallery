package com.cyberbyte.photogallery.usecase

import com.cyberbyte.photogallery.model.Photo
import com.cyberbyte.photogallery.service.PhotoGalleryDataService

// Use case for Getting photos and metadata from remote REST-API
class GetRemotePhotoGalleryUseCase(
    // Provide data managing for app
    private val photoGalleryDataService: PhotoGalleryDataService
) {
    // Processing data from remote REST-API
    suspend fun invoke(): List<Photo>{
        return photoGalleryDataService.fetchPhotos()
    }
}