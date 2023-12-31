// Generated by view binder compiler. Do not edit!
package com.example.projeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projeto.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTelaDeCadastroBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText Email;

  @NonNull
  public final TextView createText;

  @NonNull
  public final EditText fullName;

  @NonNull
  public final ImageButton imageButton13;

  @NonNull
  public final ScrollView mainScroll;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText phone;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button registerBtn;

  @NonNull
  public final TextView textView19;

  private ActivityTelaDeCadastroBinding(@NonNull RelativeLayout rootView, @NonNull EditText Email,
      @NonNull TextView createText, @NonNull EditText fullName, @NonNull ImageButton imageButton13,
      @NonNull ScrollView mainScroll, @NonNull EditText password, @NonNull EditText phone,
      @NonNull ProgressBar progressBar, @NonNull Button registerBtn, @NonNull TextView textView19) {
    this.rootView = rootView;
    this.Email = Email;
    this.createText = createText;
    this.fullName = fullName;
    this.imageButton13 = imageButton13;
    this.mainScroll = mainScroll;
    this.password = password;
    this.phone = phone;
    this.progressBar = progressBar;
    this.registerBtn = registerBtn;
    this.textView19 = textView19;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTelaDeCadastroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTelaDeCadastroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_tela_de_cadastro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTelaDeCadastroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Email;
      EditText Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.createText;
      TextView createText = ViewBindings.findChildViewById(rootView, id);
      if (createText == null) {
        break missingId;
      }

      id = R.id.fullName;
      EditText fullName = ViewBindings.findChildViewById(rootView, id);
      if (fullName == null) {
        break missingId;
      }

      id = R.id.imageButton13;
      ImageButton imageButton13 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton13 == null) {
        break missingId;
      }

      id = R.id.mainScroll;
      ScrollView mainScroll = ViewBindings.findChildViewById(rootView, id);
      if (mainScroll == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.phone;
      EditText phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.registerBtn;
      Button registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      return new ActivityTelaDeCadastroBinding((RelativeLayout) rootView, Email, createText,
          fullName, imageButton13, mainScroll, password, phone, progressBar, registerBtn,
          textView19);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
