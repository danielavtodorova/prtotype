package com.prototype.message.conf;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.google.gson.Gson;

@Configuration
@EnableWebSocket
public class WebSocketConfig extends TextWebSocketHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketConfig.class);

	class SocketHandler extends TextWebSocketHandler {

		List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

		@Override
		public void handleTextMessage(WebSocketSession session, TextMessage message)
				throws InterruptedException, IOException {

			for (WebSocketSession webSocketSession : sessions) {
				Map value = new Gson().fromJson(message.getPayload(), Map.class);
				webSocketSession.sendMessage(new TextMessage("Hello " + value.get("name") + " !"));
			}
		}

		@Override
		public void afterConnectionEstablished(WebSocketSession session) throws Exception {
			// the messages will be broadcasted to all users.
			sessions.add(session);
		}

	}

	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(new SocketHandler(), "/websocket");
	}

	@Bean
	public WebSocketHandler myHandler() {
		return new SocketHandler();
	}

}