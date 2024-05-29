// Generated by view binder compiler. Do not edit!
package com.grzeluu.plantcareapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.grzeluu.plantcareapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarMyPlantsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btShowProfile;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final ImageView ivIcon;

  @NonNull
  public final TextView tvTitle;

  private ToolbarMyPlantsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView btShowProfile, @NonNull ConstraintLayout container,
      @NonNull ImageView ivIcon, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btShowProfile = btShowProfile;
    this.container = container;
    this.ivIcon = ivIcon;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarMyPlantsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarMyPlantsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar_my_plants, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarMyPlantsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt_show_profile;
      ImageView btShowProfile = ViewBindings.findChildViewById(rootView, id);
      if (btShowProfile == null) {
        break missingId;
      }

      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.iv_icon;
      ImageView ivIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivIcon == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ToolbarMyPlantsBinding((ConstraintLayout) rootView, btShowProfile, container,
          ivIcon, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
