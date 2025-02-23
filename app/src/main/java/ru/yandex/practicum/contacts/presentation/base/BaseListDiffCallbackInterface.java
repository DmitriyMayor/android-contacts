package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

public interface BaseListDiffCallbackInterface<T extends ListDiffInterface<T>> {
    boolean theSameAs(T t);

    boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem);

    boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem);
}
