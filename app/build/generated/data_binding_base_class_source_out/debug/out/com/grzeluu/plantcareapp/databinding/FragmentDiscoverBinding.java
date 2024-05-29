// Generated by view binder compiler. Do not edit!
package com.grzeluu.plantcareapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.grzeluu.plantcareapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDiscoverBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final RecyclerView rvPlants;

  @NonNull
  public final ToolbarDiscoveryBinding toolbar;

  private FragmentDiscoverBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView3,
      @NonNull RecyclerView rvPlants, @NonNull ToolbarDiscoveryBinding toolbar) {
    this.rootView = rootView;
    this.imageView3 = imageView3;
    this.rvPlants = rvPlants;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDiscoverBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDiscoverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_discover, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDiscoverBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.rv_plants;
      RecyclerView rvPlants = ViewBindings.findChildViewById(rootView, id);
      if (rvPlants == null) {
        break missingId;
      }

      id = R.id.toolbar;
      View toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }
      ToolbarDiscoveryBinding binding_toolbar = ToolbarDiscoveryBinding.bind(toolbar);

      return new FragmentDiscoverBinding((ConstraintLayout) rootView, imageView3, rvPlants,
          binding_toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
