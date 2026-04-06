public String login(LoginRequest request) {
    Usuario usuario = usuarioRepository.findByEmail(request.getEmail())
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

    if (!usuario.getPassword().equals(request.getPassword())) {
        throw new RuntimeException("Credenciales inválidas");
    }

    return jwtUtil.generateToken(usuario.getEmail());
}