package com.example.messagecontainer.entity.request;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record MainUserRequest(@NotNull Long idMainUser, List<LastMessage> lastMessages) {
}