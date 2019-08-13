package com.kurt.example.rickandmorty.locations.di

import com.kurt.example.rickandmorty.core.di.CoreComponent
import com.kurt.example.rickandmorty.locations.presentation.locationdetails.LocationDetailsFragment
import dagger.Component

/**
 * Copyright 2019, Kurt Renzo Acosta, All rights reserved.
 *
 * @author Kurt Renzo Acosta
 * @since 08/13/2019
 */
@Component(dependencies = [CoreComponent::class], modules = [LocationDetailsModule::class])
interface LocationDetailsComponent {
    fun inject(locationDetailsFragment: LocationDetailsFragment)
}