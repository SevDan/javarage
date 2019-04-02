package mp.rage.api.checkpoint.event

import mp.rage.api.checkpoint.Checkpoint
import mp.rage.api.player.Player

data class PlayerExitCheckpointEvent(
        val player : Player,
        val checkpoint : Checkpoint
) : CheckpointEvent(checkpoint)