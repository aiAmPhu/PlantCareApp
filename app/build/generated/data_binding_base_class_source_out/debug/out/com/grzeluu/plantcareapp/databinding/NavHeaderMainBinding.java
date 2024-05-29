// Generated by view binder compiler. Do not edit!
package com.grzeluu.plantcareapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.grzeluu.plantcareapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NavHeaderMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView ivPhoto;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvUsername;

  private NavHeaderMainBinding(@NonNull RelativeLayout rootView, @NonNull ImageView ivPhoto,
      @NonNull TextView tvEmail, @NonNull TextView tvUsername) {
    this.rootView = rootView;
    this.ivPhoto = ivPhoto;
    this.tvEmail = tvEmail;
    this.tvUsername = tvUsername;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavHeaderMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavHeaderMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_header_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavHeaderMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_photo;
      ImageView ivPhoto = ViewBindings.findChildViewById(rootView, id);
      if (ivPhoto == null) {
        break missingId;
      }

      id = R.id.tv_email;
      TextView tvEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvEmail == null) {
        break missingId;
      }

      id = R.id.tv_username;
      TextView tvUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvUsername == null) {
        break missingId;
      }

      return new NavHeaderMainBinding((RelativeLayout) rootView, ivPhoto, tvEmail, tvUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
